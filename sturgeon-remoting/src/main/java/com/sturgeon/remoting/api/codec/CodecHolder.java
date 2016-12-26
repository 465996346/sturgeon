package com.sturgeon.remoting.api.codec;

import java.util.HashMap;
import java.util.Map;

/**
 * 编解码器持有者
 * @author tianxiao
 * @version $Id: CodecHolder.java, v 0.1 2016年12月6日 下午2:06:09 tianxiao Exp $
 */
public class CodecHolder {
    
    // 单例，防止被实例化
    private CodecHolder() {
    }
    
    public static Codec getCodec(String key) {
        return CodecFactory.codecs.get(key);
    }
    
    private static class CodecFactory {
        public final static Map<String, Codec> codecs = new HashMap<String, Codec>();
        // 后期可换成配置
        static {
            codecs.put("sturgeon", new SturgeonCodec());
        }
    }
}
