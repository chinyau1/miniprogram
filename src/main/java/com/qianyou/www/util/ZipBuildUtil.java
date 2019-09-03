package com.qianyou.www.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author qianyou.huang
 * @date 2019-09-03 03:28
 */
@Slf4j
public class ZipBuildUtil {
    public static byte[] build(String data, String fileName) {
        //添加文件到zip中
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);

        //数据添加到zip中
        generatorZip(data, fileName, zipOutputStream);

        IOUtils.closeQuietly(zipOutputStream);
        return outputStream.toByteArray();
    }

    private static void generatorZip(String data, String fileName, ZipOutputStream zipOutputStream)
    {
        try
        {
            // 添加到zip
            zipOutputStream.putNextEntry(new ZipEntry(fileName));
            IOUtils.write(data, zipOutputStream, "UTF-8");
            zipOutputStream.closeEntry();
        }
        catch (IOException e)
        {
            log.error("压缩失败：" + fileName, e);
        }
    }

    /**
     * 生成zip文件
     *
     * @param response
     * @param data
     * @param projectName
     * @throws IOException
     */
    public static void downLoad(HttpServletResponse response, byte[] data, String projectName) throws IOException
    {
        response.reset();
        response.setHeader("Content-Disposition", "attachment; filename=\""+projectName+".zip\"");
        response.addHeader("Content-Length", "" + data.length);
        response.setContentType("application/octet-stream; charset=UTF-8");
        IOUtils.write(data, response.getOutputStream());
    }
}
