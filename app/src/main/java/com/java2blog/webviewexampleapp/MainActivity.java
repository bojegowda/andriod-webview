import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
class MainActivity : AppCompatActivity() {
   private val webView: WebView? = null
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_main)
      title = "KotlinApp"
      val webView = findViewById<WebView>(R.id.webView)
      webView.webViewClient = WebViewClient()
      webView.loadUrl("http://spoorthiadsbucket.s3-website.ap-south-1.amazonaws.com/#/")
      val webSettings = webView.settings
      webSettings.javaScriptEnabled = true
   }
   override fun onBackPressed() {
      if (webView!!.canGoBack()) {
         webView.goBack()
      } else {
         super.onBackPressed()
      }
   }
}