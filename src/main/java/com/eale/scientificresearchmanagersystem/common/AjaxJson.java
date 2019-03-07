package com.eale.scientificresearchmanagersystem.common;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public class AjaxJson {
    private boolean success = true;// 是否成功
    private String msg = "操作成功";// 提示信息
    private Object obj;// 其他信息
    private Map<String, Object> attributes;// 其他参数

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getJsonStr() {
        JSONObject obj = new JSONObject();
        obj.put("success", this.isSuccess());
        obj.put("msg", this.getMsg());
        obj.put("obj", this.obj);
        obj.put("attributes", this.attributes);
        return obj.toJSONString();
    }
    /**
     * @param data 传输数据
     * @return
     */
    public static AjaxJson success(Object data){
        AjaxJson ajaxJson = new AjaxJson();
        ajaxJson.setObj(data);
        return ajaxJson;
    }

    /**
     * @param data 传输数据
     * @param error 错误信息
     * @return
     */
    public static AjaxJson error(Object data, String error){
        AjaxJson ajaxJson = new AjaxJson();
        ajaxJson.setObj(data);
        ajaxJson.setMsg(error);
        ajaxJson.setSuccess(false);
        return ajaxJson;
    }

    /**
     * @param error 错误信息
     * @return
     */
    public static AjaxJson error(String error){
        AjaxJson ajaxJson = new AjaxJson();
        ajaxJson.setObj(null);
        ajaxJson.setMsg(error);
        ajaxJson.setSuccess(false);
        return ajaxJson;
    }
    public AjaxJson() {
        super();
    }

    public AjaxJson(boolean success, String msg, Object obj) {
        super();
        this.success = success;
        this.msg = msg;
        this.obj =  obj;
    }

    public AjaxJson(boolean success, String msg, Object obj, Map<String, Object> attributes) {
        super();
        this.success = success;
        this.msg = msg;
        this.obj = obj;
        this.attributes =  attributes;
    }
}
