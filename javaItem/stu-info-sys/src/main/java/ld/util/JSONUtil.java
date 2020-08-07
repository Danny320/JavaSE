package ld.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;

/**
 * @author LD
 * @date 2020/8/7 16:28
 */
public class JSONUtil {

    //jackson 框架提供处理json的类
    private static final ObjectMapper M = new ObjectMapper();
    static {
        //设计序列化和反序列化的日期格式
        M.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }

    //反序列化json字符串为java对象
    public static<T> T read(InputStream is,Class<T> clazz) {
        try {
            return M.readValue(is,clazz);
        } catch (IOException e) {
            throw  new RuntimeException("json反序列化失败，传入的数据格式和class类型不匹配",e);
        }
    }
    //序列化java对象为json字符串
    public static String write(Object o) {
        try {
            return M.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("json序列化失败",e);
        }
    }
}
