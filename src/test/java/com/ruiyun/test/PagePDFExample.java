package com.ruiyun.test;

import com.ruiyun.jvppeteer.Puppeteer;
import com.ruiyun.jvppeteer.options.LaunchOptions;
import com.ruiyun.jvppeteer.options.OptionsBuilder;
import com.ruiyun.jvppeteer.options.PDFOptions;
import com.ruiyun.jvppeteer.types.browser.Browser;
import com.ruiyun.jvppeteer.types.page.Page;

import java.io.IOException;
import java.util.ArrayList;

public class PagePDFExample {

    public static void main(String[] args) throws IOException {
//        String path = new String("F:\\java教程\\49期\\vuejs\\puppeteer\\.local-chromium\\win64-722234\\chrome-win\\chrome.exe".getBytes(),"GBK");
        ArrayList<String> arrayList = new ArrayList<>();
        //必须在无厘头模式下才能生效
        LaunchOptions options = new OptionsBuilder().withArgs(arrayList).withHeadless(true).withExecutablePath("D:\\develop\\project\\toString\\chrome-win\\chrome.exe").build();
        arrayList.add("--no-sandbox");
        arrayList.add("--disable-setuid-sandbox");
        Browser browser = Puppeteer.launch(options);
        Page page = browser.newPage();
        page.goTo("https://www.baidu.com/?tn=98012088_10_dg&ch=3");
        PDFOptions pdfOptions = new PDFOptions();
        pdfOptions.setPath("tes21t.pdf");
        page.pdf(pdfOptions);
    }
}
