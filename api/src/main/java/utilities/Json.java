package utilities;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class Json {
    private static final String SEPARATOR = "/";

    private JSONObject jsonObject;
    private JSONArray jsonArray;
    private String jsonString;
    private Integer jsonInteger;
    private Boolean jsonBoolean;
    private String content;

    public Json load(String folder, String name) {
        try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            String filePath = Objects.requireNonNull(loader.getResource(folder + SEPARATOR + name)).getPath();
            File file = new File(filePath);
            content = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
            jsonObject = new JSONObject(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public Json load() {
        try {
            jsonObject = new JSONObject(content);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    public JSONObject getObject(String key) {
        try {
            jsonObject = jsonObject.getJSONObject(key.replace(" ", "_").toLowerCase().trim());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    public JSONObject getObject(JSONArray jsonArray, int key) {
        try {
            jsonObject = jsonArray.getJSONObject(key);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    public JSONArray getArray(String key) {
        try {
            jsonArray = jsonObject.getJSONArray(key.replace(" ", "_").toLowerCase().trim());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }

    public JSONArray getArray(JSONArray jsonArray, int key) {
        try {
            jsonArray = jsonArray.getJSONArray(key);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }

    public String getString(String key) {
        try {
            jsonString = jsonObject.getString(key.replace(" ", "_").toLowerCase().trim());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonString;
    }

    public String getString(JSONArray jsonArray, int key) {
        try {
            jsonString = jsonArray.getString(key);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonString;
    }

    public Integer getInt(String key) {
        try {
            jsonInteger = jsonObject.getInt(key.replace(" ", "_").toLowerCase().trim());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonInteger;
    }

    public Integer getInt(JSONArray jsonArray, int key) {
        try {
            jsonInteger = jsonArray.getInt(key);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonInteger;
    }

    public Boolean getBoolean(String key) {
        try {
            jsonBoolean = jsonObject.getBoolean(key.replace(" ", "_").toLowerCase().trim());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonBoolean;
    }

    public Boolean getBoolean(JSONArray jsonArray, int key) {
        try {
            jsonBoolean = jsonArray.getBoolean(key);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonBoolean;
    }

    public Boolean isExist(String name) {
        File file = null;
        try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            String filePath = Objects.requireNonNull(loader.getResource(name)).getPath();
            file = new File(filePath);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return Objects.requireNonNull(file).exists();
    }
}
