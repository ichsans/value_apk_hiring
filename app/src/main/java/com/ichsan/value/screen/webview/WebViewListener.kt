package com.ichsan.value.webview

interface WebViewListener {
    fun onPageStarted()
    fun onPageFinished()
    fun onShouldOverrideUrl(redirectUrl: String)
    fun onProgressChange(progress:Int)
}