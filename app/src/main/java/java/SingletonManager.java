package java;

import java.util.HashMap;
import java.util.Map;

/**
 * author : cml on 2017/11/30
 * github : https://github.com/cmlgithub
 */

public class SingletonManager {

    private Map<String,Object> map = new HashMap<String, Object>() ;


    public void registService(String key,Object obj){
        if(!map.containsKey(key))
            map.put(key,obj);
    }

    public Object getService(String key){
        return map.get(key);
    }

}
