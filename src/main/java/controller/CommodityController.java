package controller;

import dao.CommodityDAO;
import dao.PageModelDAO;
import dao.impl.CommodityDAOImpl;
import model.Commodity;
import model.PageModel;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Controller
public class CommodityController {
    /**
     * @param whereName 属性名
     * @param whereValue 属性值
     *
     * 通过某一个属性来查询产品，若属性值为空则查询全部产品。
     * */
    @RequestMapping("/queryCommodity")
    public ModelAndView queryCommodity(String whereName,String whereValue){

        ModelAndView modelAndView=new ModelAndView();
        PageModel<Commodity> pageModel;
        try {
            //处理字符串乱码问题
            whereName= new String(whereName.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
            whereValue= new String(whereValue.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (null==whereValue||"".equals(whereValue)){
            whereValue="%";
        }

        PageModelDAO pageModelDAO=new CommodityDAOImpl();

        try {
            pageModel= new PageModel<>(1, pageModelDAO.getTotalRecord(whereName, whereValue), 8);
            pageModel.setWhereName(whereName);
            pageModel.setWhereValue(whereValue);
            pageModel.setList(pageModelDAO.getPageList(whereName,whereValue,pageModel.getIndex(),pageModel.getPageSize()));
            modelAndView.setViewName("commodity/manage");
            modelAndView.addObject("PageModel",pageModel);
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
            modelAndView.addObject("errormessage",e.getMessage());
        }

        return modelAndView;
    }

    @RequestMapping("/updateCommodityPageList")
    public ModelAndView updatePageList(int pageNumber,int totalRecord,int pageSize,String whereName,String whereValue){
        PageModelDAO pageModelDAO = new CommodityDAOImpl();
        PageModel<Commodity> pageModel;
        ModelAndView modelAndView=new ModelAndView();
        if (null==whereValue||"".equals(whereValue)){
            whereValue="%";
        }
        try {
            pageModel= new PageModel<>(pageNumber, totalRecord, pageSize);
            pageModel.setWhereName(whereName);
            pageModel.setWhereValue(whereValue);
            pageModel.setList(pageModelDAO.getPageList(pageModel.getWhereName(), pageModel.getWhereValue(), pageModel.getIndex(),pageModel.getPageSize()));
            modelAndView.setViewName("commodity/manage");
            modelAndView.addObject("PageModel",pageModel);
        } catch (Exception e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
            modelAndView.addObject("errormessage",e.getMessage());
        }

        return modelAndView;
    }

    @RequestMapping(value = "/addCommodity",method = RequestMethod.POST)
    public ModelAndView addCommodity(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        //todo：上传图片的问题  段俊成

        Map<String, String> map =new HashMap<String, String>();
        FileItemFactory factory = new DiskFileItemFactory(); // 针对磁盘文件创建工厂
        ServletFileUpload upload = new ServletFileUpload(factory);// 通过factory创建一个ServletFileUpload
        upload.setHeaderEncoding("utf-8");// 设成你的编码格式
        try {
            List items = upload.parseRequest(request); // 解析请求，获得表单上的一些选项。
            Iterator iter = items.iterator();
            while (iter.hasNext()) {
                FileItem item = (FileItem) iter.next(); // 取出封装成文件选项

                if (!item.isFormField()) { // 判断一个参数域是普通的表单输入域,还是文件上传域
                    String fullFileName = item.getName(); // 得到要上传的文件的绝对路径
                    System.out.println(fullFileName);
                    int idx = fullFileName.lastIndexOf(".");// 找到.的索引号
                    String subfix = fullFileName.substring(idx);// 截取文件全路径
                    String fileName = "hello"+ subfix;

                    String path = this.getClass().getResource("/").getPath();// 构建上传路径
                    path = path.substring(0, path.length() - 16) + "/assets/commoditypic";
                    File f = new File(path + "/");
                    if (!f.exists()) {
                        f.mkdirs();
                    }
                    try {
                        String fileurl =path +"/"+ fileName;
                        item.write(new File(fileurl)); // 写入文件路径
                        map.put("imageUrl", "/commoditypic/"+fileName);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    // 这是普通的参数域

                    map.put(item.getFieldName(), new String(item.getString().getBytes("ISO-8859-1"), StandardCharsets.UTF_8));//表单传输的时候会出现乱码，根据自身情况更改
                }
            }
        } catch (FileUploadException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if (map.size() >0) {
            System.out.println(map.toString());
            //最后以把map的取值取出来后放到数据库中
            // int result =GoodsDAO.addGood(map.get("goodCount"), map.get("imageUrl"), map.get("typeName"), map.get("goodDescribe"), map.get("bigtype"), map.get("goodPrice"), map.get("smarttype"));

        }





        ModelAndView modelAndView=new ModelAndView();
        CommodityDAO commodityDAO=new CommodityDAOImpl();

        return new ModelAndView();
    }

    @RequestMapping("/editCommodity")
    public ModelAndView editCommodity(Commodity commodity){

        ModelAndView modelAndView=new ModelAndView();
        try {
//            //处理字符串乱码问题
//            commodity.setCategory(new String(commodity.getCategory().getBytes("ISO8859-1"), StandardCharsets.UTF_8));
            CommodityDAO commodityDAO = new CommodityDAOImpl();
            commodityDAO.editCommodity(commodity);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            modelAndView.setViewName("error");
            modelAndView.addObject("errormessage",e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ModelAndView();
    }

    public String turnString(String s) throws UnsupportedEncodingException {
        s=new String(s.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
        return s;
    }
    /**
     * @param idcommodity 商品数据库id
     * 将该商品设置为冻结状态。
     * */
    @RequestMapping("/removeCommodity")
    public void removeCommodity(int idcommodity) throws SQLException {
        CommodityDAO commodityDAO = new CommodityDAOImpl();
        commodityDAO.removeCommodity(idcommodity);
    }

}
