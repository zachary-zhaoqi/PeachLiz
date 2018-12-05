package dao;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Tool {
    public String turnString(String s) throws UnsupportedEncodingException {
        s=new String(s.getBytes("ISO8859-1"), StandardCharsets.UTF_8);
        return s;
    }


}
