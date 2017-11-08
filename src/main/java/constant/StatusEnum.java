package constant;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nangu on 2017/9/22.
 */
public enum StatusEnum {
    OPEN("开通", 0),
    CLOSE("关闭", 1);

    private String name;
    private int value;
    private static Map<String, StatusEnum> map = new HashMap<String, StatusEnum>() {
        {
            for(StatusEnum type: StatusEnum.values()) {
                put(String.valueOf(type.getValue()), type);
            }
            System.out.println(this.size());
        }
    };

    StatusEnum(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    static {
        System.out.println("this is status");
    }

    public static StatusEnum getEnumByValue(int value) {
        return map.get(String.valueOf(value));
    }
}
