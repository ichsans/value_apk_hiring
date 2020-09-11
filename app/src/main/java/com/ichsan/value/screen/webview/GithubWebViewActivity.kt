package com.ichsan.value.webview

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.ichsan.value.R
import com.ichsan.value.databinding.ActivityGithubWebViewBinding

@Suppress("DEPRECATION")
class GithubWebViewActivity : AppCompatActivity(), WebViewListener {
    private lateinit var binding: ActivityGithubWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_github_web_view)
        binding.webView.loadUrl("https://github.com/khairulichsan/value_apk_hiring")

binding.webView.webChromeClient = webChrome(this)
        binding.webView.webViewClient = gitClient(this)

    }
    class webChrome(private  val listener: WebViewListener):WebChromeClient(){
        override fun onProgressChanged(view: WebView?, newProgress: Int) {
            super.onProgressChanged(view, newProgress)
            listener.onProgressChange(newProgress)
        }

    }
    class gitClient(private val listener: WebViewListener):WebViewClient(){
        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            super.onPageStarted(view, url, favicon)
            listener.onPageStarted()
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            listener.onPageFinished()
        }
        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            listener.onShouldOverrideUrl(url.orEmpty())
            return super.shouldOverrideUrlLoading(view, url)
        }



        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                listener.onShouldOverrideUrl(request?.url.toString().orEmpty())
            }
            return super.shouldOverrideUrlLoading(view, request)
        }

    }

    override fun onPageStarted() {
       binding.progressBar.visibility = View.VISIBLE
        Toast.makeText(this,"Page Started", Toast.LENGTH_SHORT).show()
    }

    override fun onPageFinished()  {
        binding.progressBar.visibility = View.GONE
    }

    override fun onShouldOverrideUrl(redirectUrl: String){
        Toast.makeText(this,"redirect URL : $redirectUrl", Toast.LENGTH_SHORT).show()
    }

    override fun onProgressChange(progress: Int) {
        binding.progressBar.progress = progress
    }
}