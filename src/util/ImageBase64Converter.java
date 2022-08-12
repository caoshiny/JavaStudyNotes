package util;

import sun.misc.BASE64Encoder;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageBase64Converter {

    public static byte[] getFileStream(String url){
        try {
            URL httpUrl = new URL(url);
            HttpURLConnection conn = (HttpURLConnection)httpUrl.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5 * 1000);
            InputStream inStream = conn.getInputStream();//通过输入流获取图片数据
            byte[] btImg = readInputStream(inStream);//得到图片的二进制数据
            return btImg;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static byte[] readInputStream(InputStream inStream) throws Exception{
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while( (len=inStream.read(buffer)) != -1 ){
            outStream.write(buffer, 0, len);
        }
        inStream.close();
        return outStream.toByteArray();
    }

    public static void main(String[] args) {
        String url = "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fwww.itclub16.com%2Fzb_users%2Fupload%2F2020%2F01%2Fwxsync-19318299375e2402454064d1579418181.png&refer=http%3A%2F%2Fwww.itclub16.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1642917451&t=e3bc08b374e68b6adb33c0d7c22c7b80";
        byte[] biImage = getFileStream(url);
        BASE64Encoder encoder = new BASE64Encoder();
        System.out.println(encoder.encode(biImage));
    }
}
