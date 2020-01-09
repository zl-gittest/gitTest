package Service;

import com.baidu.aip.ocr.AipOcr;
import org.json.JSONObject;

import java.util.HashMap;

public class testSample {
    public static  void sample(AipOcr client, String image) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("language_type", "CHN_ENG");
        options.put("detect_direction", "true");
        options.put("detect_language", "true");
        options.put("probability", "true");


        // 参数为本地路径
//        String image = "D:\\test.jpg";
        JSONObject res = client.basicGeneral(image, options);
        System.out.println(res.toString(2));

        // 参数为二进制数组
//        byte[] file = readFile("test.jpg");
//        res = client.basicGeneral(file, options);
//        System.out.println(res.toString(2));

        // 通用文字识别, 图片参数为远程url图片
//        JSONObject res = client.basicGeneralUrl(url, options);
//        System.out.println(res.toString(2));

    }

    public static void main(String[] args) {
        AipOcr aipOcr = new AipOcr(UserMess.APP_ID, UserMess.API_KEY, UserMess.SECRET_KEY);
        String image = "D:\\test.jpg";
        sample(aipOcr,image);
    }
}
