package com.lingyfh.gsonparse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GsonIntUnitTest {
    @Test
    public void json_int2int() {
        String json = "{\"flag\": 1}";

        Data data = GSON.parseObject(json, Data.class);
        assertEquals(data.flag, 1);
        assertNotNull(data);

        json = "{\"flag\": -1}";
        data = GSON.parseObject(json, Data.class);
        assertEquals(data.flag, -1);
        assertNotNull(data);

        json = "{\"flag\": 0}";
        data = GSON.parseObject(json, Data.class);
        assertEquals(data.flag, 0);
        assertNotNull(data);
    }

    @Test
    public void json_boolean2int() {
        String json = "{\"flag\": true}";
        Data data = GSON.parseObject(json, Data.class);
        assertEquals(data.flag, 1);
        assertNotNull(data);

        json = "{\"flag\": false}";
        data = GSON.parseObject(json, Data.class);
        assertEquals(data.flag, 0);
        assertNotNull(data);


        json = "{\"flag\": \"false\"}";
        data = GSON.parseObject(json, Data.class);
        assertEquals(data.flag, 0);
        assertNotNull(data);

        json = "{\"flag\": \"true\"}";
        data = GSON.parseObject(json, Data.class);
        assertEquals(data.flag, 1);
        assertNotNull(data);
    }

    @Test
    public void json_string2int() {
        String json = "{\"flag\": \"1\"}";
        Data data = GSON.parseObject(json, Data.class);
        assertEquals(data.flag, 1);
        assertNotNull(data);

        json = "{\"flag\": \"-1\"}";
        data = GSON.parseObject(json, Data.class);
        assertEquals(data.flag, -1);
        assertNotNull(data);

        json = "{\"flag\": \"0\"}";
        data = GSON.parseObject(json, Data.class);
        assertEquals(data.flag, 0);
        assertNotNull(data);
    }

    @Test
    public void json_int2integer() {
        String json = "{\"flag\": 1}";

        DataInteger data = GSON.parseObject(json, DataInteger.class);
        assertEquals(data.flag.intValue(), 1);
        assertNotNull(data);

        json = "{\"flag\": -1}";
        data = GSON.parseObject(json, DataInteger.class);
        assertEquals(data.flag.intValue(), -1);
        assertNotNull(data);

        json = "{\"flag\": 0}";
        data = GSON.parseObject(json, DataInteger.class);
        assertEquals(data.flag.intValue(), 0);
        assertNotNull(data);
    }

    @Test
    public void json_boolean2integer() {
        String json = "{\"flag\": true}";
        DataInteger data = GSON.parseObject(json, DataInteger.class);
        assertEquals(data.flag.intValue(), 1);
        assertNotNull(data);

        json = "{\"flag\": false}";
        data = GSON.parseObject(json, DataInteger.class);
        assertEquals(data.flag.intValue(), 0);
        assertNotNull(data);


        json = "{\"flag\": \"false\"}";
        data = GSON.parseObject(json, DataInteger.class);
        assertEquals(data.flag.intValue(), 0);
        assertNotNull(data);

        json = "{\"flag\": \"true\"}";
        data = GSON.parseObject(json, DataInteger.class);
        assertEquals(data.flag.intValue(), 1);
        assertNotNull(data);
    }

    @Test
    public void json_string2integer() {
        String json = "{\"flag\": \"1\"}";
        DataInteger data = GSON.parseObject(json, DataInteger.class);
        assertEquals(data.flag.intValue(), 1);
        assertNotNull(data);

        json = "{\"flag\": \"-1\"}";
        data = GSON.parseObject(json, DataInteger.class);
        assertEquals(data.flag.intValue(), -1);
        assertNotNull(data);

        json = "{\"flag\": \"0\"}";
        data = GSON.parseObject(json, DataInteger.class);
        assertEquals(data.flag.intValue(), 0);
        assertNotNull(data);
    }

    @Test
    public void json_integer_null() {
        DataInteger data = new DataInteger();

        String json = GSON.toJSONString(data);
        assertTrue(json.contains("flag") && json.contains("0") && !json.contains("null"));
    }

    @Test
    public void json_int_null() {
        Data data = new Data();

        String json = GSON.toJSONString(data);
        assertTrue(json.contains("flag") && json.contains("0") && !json.contains("null"));
    }

    private static class Data {
        public int flag;
    }

    private static class DataInteger {
        public Integer flag;
    }
}
