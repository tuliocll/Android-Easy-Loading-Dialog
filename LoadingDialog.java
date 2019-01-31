import android.app.Activity;
import android.app.Dialog;
import android.util.Log;
import android.view.Window;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

public class LoadingDialog {

    Dialog dialog;
    Activity activity;
    int loadImageGif;
    Boolean cancelable = false;

    public LoadingDialog(Activity activity) {
        this.activity = activity;
    }

    //set drawable of loading gif
    public void setLoadImage(int img){
        this.loadImageGif = img;
    }

    //(optional)if user can cancel(click out of layout)
    public void setCancelable(Boolean state){
        this.cancelable = state;
    }

    public void show() {
        if(loadImageGif!=0){
            dialog  = new Dialog(activity);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            //inflate the layout
            dialog.setContentView(R.layout.custom_loading_dialog_layout);
            //setup cancelable, default=false
            dialog.setCancelable(cancelable);
            //get imageview to use in Glide
            ImageView imageView = dialog.findViewById(R.id.custom_loading_imageView);
            GlideDrawableImageViewTarget imageViewTarget = new GlideDrawableImageViewTarget(imageView);

            //load gif and callback to imageview
            Glide.with(activity)
                    .load(loadImageGif)
                    .placeholder(loadImageGif)
                    .centerCrop()
                    .crossFade()
                    .into(imageViewTarget);

            dialog.show();
        }else{
            Log.e("LoadingDialog", "Erro, missing drawable of imageloading (gif), please, use setLoadImage(R.drawable.name).");
        }
    }

    //Dismiss the dialog
    public void hide(){
        dialog.dismiss();
    }

}