package entity;


import lombok.Data;


import java.io.Serializable;

/**
 * @author miss
 * <p>
 * Created by miss on 2018/3/27
 */
@Data
public class Result<T> implements Serializable{




    private String code;
    private String message;
    private T data;


//    public <T> T showKeyName(Generic<T> container){
//        System.out.println("container key :" + container.getKey());
//        //当然这个例子举的不太合适，只是为了说明泛型方法的特性。
//        T test = container.getKey();
//        return test;
//    }

    public static <T> Result OK(T data){
        Result result = new Result();
        result.setData(data);
        result.setMessage("success");
        result.setCode("true");
        return result;
    }
    public static <T> Result ERROR(T data){
        Result result = new Result();
        result.setMessage("fail");
        result.setCode("false");
        result.setData(data);
        return result;
    }

}
