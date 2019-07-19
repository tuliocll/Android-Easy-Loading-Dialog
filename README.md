[![Language](https://img.shields.io/badge/Language-Java-orange.svg)](https://github.com/topics/java)
[![Platforms](https://img.shields.io/badge/Plataform-Android-brightgreen.svg)](https://developer.android.com/)

# Android-Easy-Loading-Dialog
Create and show and hide a loading animation(alternative to progressDialog that is deprecated). 


##### We use [Glide](https://github.com/bumptech/glide) to load and play the gif!.

<img src="https://github.com/tuliocll/Android-Easy-Loading-Dialog/blob/master/preview.gif" alt="Loading Dialog preview" width="320px"></img>

## Install

This class are tested with API 16 - 28, so i think it will be compatible with all android versions.

**Import Glide library**

How to install [here.](https://github.com/bumptech/glide)

**Import [LoadingDialog.java](https://github.com/tuliocll/Android-Easy-Loading-Dialog/blob/master/LoadingDialog.java) and [custom_loading_dialog_layout.xml](https://github.com/tuliocll/Android-Easy-Loading-Dialog/blob/master/custom_loading_dialog_layout.xml)**

**Import a GIF to you Drawable folder [(sample free loading gifs)](https://www.behance.net/gallery/31234507/Open-source-Loading-GIF-Icons-Vol-1)**

## Usage
**Call it on yout activity**

```java
LoadingDialog loadingDialog = new LoadingDialog(Activity.this);
loadingDialog.setLoadImage(R.drawable.loading);
loadingDialog.show();
//to dissmis use: loadingDialog.hide();
```

## Methods

| method name          | Type       | Default             | Description                          |
| ---                  | ---        | ---                 | ---                                  |
| **setLoadImage**     | *int*      | 0                   | Set the id of drawable(gif) to glide |
| **setCancelable**    | *boolean*  | false               | If user can cancel the dialog        |
| **show**             | *void*     | null                | Show dialog                          |
| **hide**             | *void*     | null                | Hide the dialog                      |


## License

Apache License 2.0
