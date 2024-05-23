package com.example.widget;


import org.json.JSONException;

interface OnDownloadedWeather{
    void onDownload(String result) throws JSONException;
}