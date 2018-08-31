package com.lingyfh.gsonparse;

import com.google.gson.annotations.Expose;
import org.junit.Assert;
import org.junit.Test;

public class GsonExposeUnitTest {

    @Test
    public void json() {
        Data data = new Data();
        String json = GSON.toJSONString(data);
        Assert.assertTrue(json.contains("name") && !json.contains("null"));
    }

    @Test
    public void json_expose_serialize() {
        Data data = new Data();
        data.gender = "male";
        String json = GSON.toJSONString(data);
        Assert.assertFalse(json.contains("male") && json.contains("gender"));
        Assert.assertTrue(json.contains("name") && !json.contains("null"));

        String dataJSON = "{\"name\": \"jack\", \"gender\": \"female\"}";
        data = GSON.parseObject(dataJSON, Data.class);
        Assert.assertEquals(data.gender, "female");
        Assert.assertEquals(data.name, "jack");
    }

    @Test
    public void json_expose_deserialize() {
        Data data = new Data();
        data.name = "jack";
        data.gender = "male";
        data.age = 12;

        String json = GSON.toJSONString(data);
        Assert.assertTrue(json.contains("name") && json.contains("jack"));
        Assert.assertTrue(!json.contains("gender") && !json.contains("male"));
        Assert.assertTrue(json.contains("age") && json.contains("12"));

        String deserialize = "{\"name\": \"jack\", \"age\": 21, \"gender\": \"female\"}";

        Data deData = GSON.parseObject(deserialize, Data.class);
        Assert.assertEquals(deData.name, "jack");
        Assert.assertEquals(deData.gender, "female");
        Assert.assertEquals(deData.age, 0);
    }

    @Test
    public void json_serialize_deserialize() {
        Data data = new Data();
        data.name = "jack";
        data.nickname = "dog J";
        data.gender = "male";
        data.age = 21;

        String json = GSON.toJSONString(data);
        Assert.assertTrue(json.contains("name") && json.contains("jack"));
        Assert.assertTrue(json.contains("age") && json.contains("21"));
        Assert.assertTrue(!json.contains("gender") && !json.contains("male"));
        Assert.assertTrue(!json.contains("nickname") && !json.contains("dog J"));

        String dataJson = "{\"name\": \"jack\", \"gender\": \"female\", \"age\": 12, \"nickname\": \"big dog\"}";

        Data value = GSON.parseObject(dataJson, Data.class);
        Assert.assertEquals(value.name, "jack");
        Assert.assertEquals(value.gender, "female");
        Assert.assertEquals(value.age, 0);
        Assert.assertEquals(value.nickname, null);
    }

    class Data {
        public String name;

        @Expose(serialize = false)
        public String gender;

        @Expose(deserialize = false)
        public int age;

        @Expose(serialize = false, deserialize = false)
        public String nickname;

    }

}
