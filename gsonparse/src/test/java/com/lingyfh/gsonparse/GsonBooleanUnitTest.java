package com.lingyfh.gsonparse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GsonBooleanUnitTest {

    @Test
    public void json_boolean2boolean() {
        String json = "{\"isVip\": true}";
        Data data = GSON.parseObject(json, Data.class);
        assertNotNull(data);
        assertEquals(true, data.isVip);

        json = "{\"isVip\": false}";
        data = GSON.parseObject(json, Data.class);
        assertNotNull(data);
        assertEquals(false, data.isVip);
    }

    @Test
    public void json_string2boolean() {
        String json = "{\"isVip\": \"true\"}";
        Data data = GSON.parseObject(json, Data.class);
        assertNotNull(data);
        assertEquals(true, data.isVip);

        json = "{\"isVip\": \"false\"}";
        data = GSON.parseObject(json, Data.class);
        assertNotNull(data);
        assertEquals(false, data.isVip);
    }

    @Test
    public void json_int2boolean() {
        String json = "{\"isVip\": 1}";
        Data data = GSON.parseObject(json, Data.class);
        assertNotNull(data);
        assertEquals(true, data.isVip);

        json = "{\"isVip\": 0}";
        data = GSON.parseObject(json, Data.class);
        assertNotNull(data);
        assertEquals(false, data.isVip);

        json = "{\"isVip\": -1}";
        data = GSON.parseObject(json, Data.class);
        assertNotNull(data);
        assertEquals(false, data.isVip);

        json = "{\"isVip\": 2}";
        data = GSON.parseObject(json, Data.class);
        assertNotNull(data);
        assertEquals(false, data.isVip);
    }

    @Test
    public void json_boolean2Boolean() {
        String json = "{\"isVip\": true}";
        DataBoolean data = GSON.parseObject(json, DataBoolean.class);
        assertNotNull(data);
        assertEquals(true, data.isVip);

        json = "{\"isVip\": false}";
        data = GSON.parseObject(json, DataBoolean.class);
        assertNotNull(data);
        assertEquals(false, data.isVip);
    }


    @Test
    public void json_string2Boolean() {
        String json = "{\"isVip\": \"true\"}";
        DataBoolean data = GSON.parseObject(json, DataBoolean.class);
        assertNotNull(data);
        assertEquals(true, data.isVip);

        json = "{\"isVip\": \"false\"}";
        data = GSON.parseObject(json, DataBoolean.class);
        assertNotNull(data);
        assertEquals(false, data.isVip);
    }

    @Test
    public void json_int2Boolean() {
        String json = "{\"isVip\": 1}";
        DataBoolean data = GSON.parseObject(json, DataBoolean.class);
        assertNotNull(data);
        assertEquals(true, data.isVip);

        json = "{\"isVip\": 0}";
        data = GSON.parseObject(json, DataBoolean.class);
        assertNotNull(data);
        assertEquals(false, data.isVip);

        json = "{\"isVip\": -1}";
        data = GSON.parseObject(json, DataBoolean.class);
        assertNotNull(data);
        assertEquals(false, data.isVip);

        json = "{\"isVip\": 2}";
        data = GSON.parseObject(json, DataBoolean.class);
        assertNotNull(data);
        assertEquals(false, data.isVip);

        json = "{\"isVip\": \"2\"}";
        data = GSON.parseObject(json, DataBoolean.class);
        assertNotNull(data);
        assertEquals(false, data.isVip);

        json = "{\"isVip\": \"1\"}";
        data = GSON.parseObject(json, DataBoolean.class);
        assertNotNull(data);
        assertEquals(true, data.isVip);

        json = "{\"isVip\": \"0\"}";
        data = GSON.parseObject(json, DataBoolean.class);
        assertNotNull(data);
        assertEquals(false, data.isVip);

        json = "{\"isVip\": \"-1\"}";
        data = GSON.parseObject(json, DataBoolean.class);
        assertNotNull(data);
        assertEquals(false, data.isVip);
    }


    @Test
    public void json_Boolean_null() {
        DataBoolean data = new DataBoolean();

        String json = GSON.toJSONString(data);
        assertTrue(json.contains("isVip") && json.contains("false") && !json.contains("null"));
    }

    @Test
    public void json_boolean_null() {
        Data data = new Data();

        String json = GSON.toJSONString(data);
        assertTrue(json.contains("isVip") && json.contains("false") && !json.contains("null"));
    }

    static class Data {
        public boolean isVip;
    }

    static class DataBoolean {
        public Boolean isVip;
    }

}
