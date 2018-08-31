package com.lingyfh.gsonparse;

import junit.framework.Assert;
import org.junit.Test;

public class GsonStringUnitTest {

    @Test
    public void json_string() {

        String json = GSON.toJSONString(null);
        Assert.assertTrue(json.equals("null"));
    }

    @Test
    public void json_data2string() {
        Data data = new Data();
        String json = GSON.toJSONString(data);
        Assert.assertTrue(json.contains("name") && !json.contains("null"));
    }

    @Test
    public void json_string2data() {
        String json = "{\"name\":\"\"}";
        Data data = GSON.parseObject(json, Data.class);
        Assert.assertEquals(data.name, "");

        json = "{\"name\":\"jack\"}";
        data = GSON.parseObject(json, Data.class);
        Assert.assertEquals(data.name, "jack");


        json = "{\"name\":123}";
        data = GSON.parseObject(json, Data.class);
        Assert.assertEquals(data.name, "123");

    }


    class Data {
        public String name;
    }

}
