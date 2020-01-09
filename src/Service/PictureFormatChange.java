package Service;

import com.baidu.aip.ocr.AipOcr;
import org.json.JSONObject;

import java.util.HashMap;

public class PictureFormatChange {

    /**
     * @desc:通用识别
     * @date:2019/11/26
     * @author zuoliang
     */
    public static JSONObject universalText(AipOcr client, String image) {//image是图片的路径
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("language_type", "CHN_ENG");
        options.put("detect_direction", "true");
        options.put("detect_language", "true");
        options.put("probability", "true");

        JSONObject res = client.basicGeneral(image, options);
        return res;
    }

    /**
     * @desc:通用高精度文字识别
     * @date:2019/11/26
     * @author zuoliang
     */
    public static JSONObject universalTextAcc(AipOcr client, String image) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("detect_direction", "true");
        options.put("probability", "true");

        JSONObject res = client.basicAccurateGeneral(image, options);
        return res;
    }


    /**
     * @desc: 位置信息
     * @date:2019/11/26
     * @author zuoliang
     */
    public static JSONObject universalTextPos(AipOcr client, String image) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("recognize_granularity", "big");
        options.put("language_type", "CHN_ENG");
        options.put("detect_direction", "true");
        options.put("detect_language", "true");
        options.put("vertexes_location", "true");
        options.put("probability", "true");

        JSONObject res = client.general(image, options);
        return res;
    }

    /**
     * @desc:高精度加位置
     * @date:2019/11/26
     * @author zuoliang
     */
    public static JSONObject universalTextPosAndAcc(AipOcr client, String image) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("recognize_granularity", "big");
        options.put("detect_direction", "true");
        options.put("vertexes_location", "true");
        options.put("probability", "true");

        JSONObject res = client.accurateGeneral(image, options);
        return res;
    }


    /**
     * @desc:通用文字识别（含生僻字版）
     * @date:2019/11/26
     * @author zuoliang
     */
    public static JSONObject universalTextenhancedGeneral(AipOcr client, String image) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("language_type", "CHN_ENG");
        options.put("detect_direction", "true");
        options.put("detect_language", "true");
        options.put("probability", "true");

        JSONObject res = client.enhancedGeneral(image, options);
        return res;
    }

    /**
     * @desc:网络图片文字识别
     * @date:2019/11/26
     * @author zuoliang
     */
    public static JSONObject universalTextWebImage(AipOcr client, String image) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("detect_direction", "true");
        options.put("detect_language", "true");

        JSONObject res = client.webImage(image, options);
        return res;
    }

    /**
     * @desc:通用票据识别
     * @date:2019/11/26
     * @author zuoliang
     */
    public static JSONObject universalTextReceipt(AipOcr client, String image) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("recognize_granularity", "big");
        options.put("probability", "true");
        options.put("accuracy", "normal");
        options.put("detect_direction", "true");

        JSONObject res = client.receipt(image, options);
        return res;
    }

    /**
     * @desc:火车票识别
     * @date:2019/11/26
     * @author zuoliang
     */
    public static JSONObject universalTexttrainTicket(AipOcr client, String image) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();

        JSONObject res = client.trainTicket(image, options);
        return res;
    }


    /**
     * @desc:出租车票识别
     * @date:2019/11/26
     * @author zuoliang
     */
    public static JSONObject universalTextTaxiReceipt(AipOcr client, String image) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();

        JSONObject res = client.taxiReceipt(image, options);
        return res;
    }

    /**
     * @desc:增值税发票识别
     * @date:2019/11/26
     * @author zuoliang
     */
    public static JSONObject universalTextVatInvoice(AipOcr client, String image) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();

        JSONObject res = client.vatInvoice(image, options);
        return res;
    }


    /**
     * @desc:表格文字识别（同步接口）
     * @date:2019/11/26
     * @author zuoliang
     */
    public static JSONObject universalTextForm(AipOcr client, String image) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();

        JSONObject res = client.form(image, options);
        return res;
    }

    /**
     * @desc:表格文字识别（异步接口）
     * @date:2019/11/26
     * @author zuoliang
     */
    public static JSONObject RequestIdTableRecognitionAsync(AipOcr client, String image) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();

        JSONObject res = client.tableRecognitionAsync(image, options);
        return res;
    }

    public static JSONObject universalTextTableRecognitionAsync(AipOcr client, String requestId) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("result_type", "json");

        // 表格识别结果
        JSONObject res = client.tableResultGet(requestId, options);
        return res;
    }

    /**
     * @desc:手写文字识别
     * @date:2019/11/26
     * @author zuoliang
     */
    public static JSONObject universalHandwriting(AipOcr client, String image) {
        // 传入可选参数调用接口
        HashMap<String, String> options = new HashMap<String, String>();
        options.put("recognize_granularity", "big");

        JSONObject res = client.handwriting(image, options);
        return res;
    }


}
