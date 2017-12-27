package com.demo.controller.xx;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016082600317284";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCHDv9rQUFeu02hJhzmEBbKWy6maV6aTKEi6McmC0Np7vlDeQtvYsETquNvT12iBUshSqLEg2fPFgAMBIqgieuNcYj9pkRMYAUKBfuvVegnoug670vCik1FfTWHmUhClY1TqxAnyGaLDhejYDSKKsBkAC3w80xN5wfrweiW6wMV0GdUHSJvXA80g7eoyl4UAnLGFI5ZanlC3vG23EvFfrCsPUdah3LWjsl/SIQDtpoTaGxupdiQxltru5YEp+3zlAHt4L5+zCsunqYUXcKoHCqVBuPEJHinA1nWem4XPMBC6GQwjZa7n3Z790XNk95nkc0EuH6zw3iKOzrrh/a6a4OVAgMBAAECggEABTBoU+Cf+FnN88EZHyXDGmdCdZZa0ibbkhHLhQStxGYwIY2HCPKMZIsOTfqIqG73ogHSGybJWEWKHuwVv3FNIZQZJVW8DgsqZmYwc14jm1JBBfKnwIO70E2tPtZ+1kAUvAA4kK68cd9KvTY3Do/x8GWpXjaa2etkfIRowVOqPK5EwdGuMDsboiYY2PP+l6rZYWmi0Ko85fwTXCruHceviNGUdRcpElyAh8sxP467Em9lR3gQubFuuq3DjjKVgpHkseFBryyuIw5NRoOvLbXDR5vBZhdXBoS2TS3r/5fF6JGvnNfTPGDqFNtNmOBroukH2+SD6ZQh8g5yx4/zXMw7SQKBgQDTgYlAeANdwiZ68QFTwIXmMxLiI/Up6DGGN/7Z5j1a5sYkeoJzzpeDWDXKDHw42KgNSP5+YNtCbTOvQwi7J9ahNTmyBv1tA/u55bLQ/cn/S26LHZ1xpwET+MNLFa5Pc4TI+aGhCX/GSAcC9kDX89ogmp9eor0K58fK2jay1XxILwKBgQCjeHSRdEQrhh194cpOemFmHfwo0ru1Z/+iXx13fki5jtuoZg6JWSPq0x+iTXHTltCq50vU0sZAOg7khge+KsIhGaYTino5nko8AqZMaiynlvX7VbpbmioLHO4e/RszKh5AEPR96QJcc6UvGWget5BZ+DEjg3+qNaBKPv5p1447ewKBgQCwYwQStsOf6m1q9Bi2PwWr8AYcf/5Sf6jllUc9c2zRpUmzXFP0vmLPD750DSt/wPeNdMWAocfZQvbqf84FPvkYoinGlVu+EadZ5fzVnAFcngzHieAmyy7z9+7ubFtdOSqQ7NZlVWWw95qZVsLHFj9gF3M3WiKruJZ/TrJ1O+MU0wKBgG1Fd6ZDMc5mOBCNfc43wCOip4wiUZdRjW/cZLYblEF1XR+UGON20quFtP+pBQ2LIrEbK3V3702/gXUAouxbaKj3nCwzxL//L2At5TvvPSpJnuQCyi+xPalwDTxptGTfIplwu/3uY8WpCCITuaXOzo9VeINkw1HjxuHaefYGQO1BAoGAC1Mz0d3TQEXMLfnKJYAV0FOXt/p3h2CyiAPB/69zCZNWLqjtr4TFFD2N0/7cGiLoQYDnQODDL6TBKNLBRvnPEMZYOg1DxxhM9Ejn+UyZlxSSHUlG7z9rJoRrqaCJdikTZjXB5CZ9HtMl8S4o9xXVan1OsO+AR5GC13UMsSoimTs=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3V2AeD3Hx+iUtf4OIrCQDMQFR2GFhA2572LkcD8ul4QTlXYLyHuLm/QT8GkeMXtwzspLKHPLNIrcBnWl9SixV8ZJrV1QZtCll4RB/CsSMUWhtdp9e4oeQ/Ah602z8zg/0oNFg4FDT3Ni6GuTAhjHqEWWLOVRhRAxOIo+TyVVxIRAunZRJluFKdNLxWQqzbBeSCy6eiBtD+ZNqH1OOvbv0tnA4/SxCUwZITSKTuQmao+lifUI9MgxAAwK/mr8jaK/PFYmPSl8I5iO5ualTMvlOCkvHG0kP/wjQ785TheRnOwYSuNmsyXMp5abp819T4qGMH/ggQ0tuDaTSmbu4iqmOQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://7ad3d84f.ngrok.io/Book/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://127.0.0.1:9999/BankingProject/hyzx/upchong";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

