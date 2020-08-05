package com.gaussic.app;

public class ObjectUtils {
    /**
     * 阿里巴巴有上万名程序员，层级不一，用法和解决的问题也不一。
     * 现在你需要给他们写一个对象比较的工具类，要求：
     * <ul>
     * <li>1. 考虑足够的容错性</li>
     * <li>2. 考虑足够的通用性</li>
     * </ul>
     * 请完成这个工具类方法的编写
     *
     * <p>本题重点考察候选人的编码习惯、思维严谨、封装边界和Java基础深度</p>
     * @param src 源对象
     * @param dst 目标对象
     * @return TRUE:对象相等;FALSE:对象不相等
     */
    public static boolean isDeepEquals(Object src, Object dst) {
        if(src == null && dst == null) {
            return true;
        }
        if(src == null || dst == null){
            return false;
        }
        if(!src.equals(dst)){
            return false;
        }
        if(src.hashCode() != dst.hashCode()){
            return false;
        }
        return true;
    }
}
