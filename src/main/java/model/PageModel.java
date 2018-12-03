package model;

import java.util.List;

public class PageModel<T> {

    private List<T> list;
    private int pageNumber;     //当前页号
    private int totalRecord;    //总记录数
    private int pageSize;       //页面大小
    private int totalPage;      //总页数


    public PageModel(int pageNumber, int totalRecord, int pageSize) {
        this.pageNumber = pageNumber;
        this.totalRecord = totalRecord;
        this.pageSize = pageSize;
    }

    public List<T> getList() {
        return list;
    }
    public void setList(List<T> list) {
        this.list = list;
    }


    public int getPageNumber() {
        return this.pageNumber;
    }

    /**
     * 设置当前页号，并防止页号越界。
     * */
    public void setPageNumber(int pageNumber) {
        if (pageNumber < 1) {
            pageNumber = 1;
        }
        if (pageNumber > getTotalPage()) {
            pageNumber = getTotalPage();
        }
        this.pageNumber = pageNumber;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return 得到总的页数
     * */
    public int getTotalPage() {
        if (totalRecord % pageSize == 0) {
            return totalRecord / pageSize;
        } else {
            return (totalRecord / pageSize) + 1;
        }
    }

    /**
     * @return 当前页的索引
     * */
    public int getIndex() {
        return (getPageNumber()-1)*getPageSize();
    }

    @Override
    public String toString() {
        return "Page [list=" + list + ", pageNumber=" + pageNumber
                + ",  totalRecord=" + totalRecord
                + ", pageSize=" + pageSize + "]";
    }
}
