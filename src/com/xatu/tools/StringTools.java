package com.xatu.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTools extends Tools {

    /**
     * �ж�һ���ַ����Ƿ�Ϊ���ַ���
     * 
     * @param text  ���жϵ��ַ���
     *            
     * @return �Ƿ�Ϊ���ַ���
     */
    public static boolean isEmpty(String text) {
        if (text == null || text.length() == 0) {
            return true;
        }

        return false;
    }
    
    /**
     * ���ƥ����ַ���
     * 
     * @param str ��ƥ����ַ���
     *            
     * @param re  ƥ���������ʽ
     *            
     * @return ����ƥ����
     */
    public static String getSub(String str, String re) {
        String name = "";
        Pattern pattern = Pattern.compile(re);
        Matcher match = pattern.matcher(str);
        if (match.find(0)) {
            name = match.group();
        }

        return name;
    }

    /**
     * �ж�һ���ַ������Ƿ��������
     * 
     * @param text
     *     ��ƥ����ַ���     
     * @return
     *     �Ƿ��������
     */
    public static boolean hasChinese(String text) {
        // ƥ����ַ�����������ʽ
        String reg_charset = "[\u4e00-\u9fa5]*";

        Pattern p = Pattern.compile(reg_charset);
        Matcher m = p.matcher(text);
        
        while (m.find()) {
            if (m.group().length() > 0) {
                return true;
            }
        }

        return false;
    }
    
    /**
     * �ж�str�Ƿ�ƥ��������ʽre
     * 
     * @param str ��ƥ����ַ���
     *          
     * @param re  ƥ���������ʽ
     *          
     * @return  ƥ����
     *          
     */
    public static boolean isSub(String str, String re) {
        Pattern pattern = Pattern.compile(re);
        Matcher match = pattern.matcher(str);
        if (match.find(0)) {
            return true;
        }
        
        return false;
    }
    
    public static String format(double number) {
        return (String.format("%.2f", number));
    }
}

