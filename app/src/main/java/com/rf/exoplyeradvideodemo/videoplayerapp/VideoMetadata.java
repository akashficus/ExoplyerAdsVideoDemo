package com.rf.exoplyeradvideodemo.videoplayerapp;

import com.rf.exoplyeradvideodemo.R;

import java.util.Arrays;
import java.util.List;

/** An enumeration of video metadata. */
public enum VideoMetadata {
  PRE_ROLL_NO_SKIP(
      "https://storage.googleapis.com/gvabox/media/samples/stock.mp4",
      "Video without ad Skip",
      "https://pubads.g.doubleclick.net/gampad/ads?iu=/21775744923/external/"
          + "single_ad_samples&sz=640x480&cust_params=sample_ct%3Dlinear&"
          + "ciu_szs=300x250%2C728x90&gdfp_req=1&output=vast&unviewed_position_start=1&"
          + "env=vp&impl=s&correlator=",
      R.drawable.play_video_ic,
      false),
  PRE_ROLL_SKIP(
      "https://storage.googleapis.com/gvabox/media/samples/stock.mp4",
      "Video with Ad Skip",
      "https://pubads.g.doubleclick.net/gampad/ads?iu=/21775744923/external/"
          + "single_preroll_skippable&sz=640x480&ciu_szs=300x250%2C728x90&gdfp_req=1&"
          + "output=vast&unviewed_position_start=1&env=vp&impl=s&correlator=",
      R.drawable.play_video_ic,
      false),
  POST_ROLL(
      "https://storage.googleapis.com/gvabox/media/samples/stock.mp4",
      "Post-roll",
      "https://pubads.g.doubleclick.net/gampad/ads?iu=/21775744923/external/"
          + "vmap_ad_samples&sz=640x480&cust_params=sample_ar%3Dpostonly&ciu_szs=300x250&"
          + "gdfp_req=1&ad_rule=1&output=vmap&unviewed_position_start=1&env=vp&impl=s&correlator=",
      R.drawable.play_video_ic,
      true),
  VMAP(
      "https://storage.googleapis.com/gvabox/media/samples/stock.mp4",
      "Video with Single Ads",
      "https://pubads.g.doubleclick.net/gampad/ads?iu=/21775744923/external/"
          + "vmap_ad_samples&sz=640x480&cust_params=sample_ar%3Dpremidpost&ciu_szs=300x250&"
          + "gdfp_req=1&ad_rule=1&output=vmap&unviewed_position_start=1&env=vp&impl=s&"
          + "cmsid=496&vid=short_onecue&correlator=",
      R.drawable.play_video_ic,
      true),
  VMAP_PODS(
      "https://storage.googleapis.com/gvabox/media/samples/stock.mp4",
      "Video with Multiple Ads",
      "https://pubads.g.doubleclick.net/gampad/ads?iu=/21775744923/external/"
          + "vmap_ad_samples&sz=640x480&cust_params=sample_ar%3Dpremidpostpod&ciu_szs=300x250&"
          + "gdfp_req=1&ad_rule=1&output=vmap&unviewed_position_start=1&env=vp&impl=s&cmsid=496&"
          + "vid=short_onecue&correlator=",
      R.drawable.play_video_ic,
      true),
  WRAPPER(
      "https://storage.googleapis.com/gvabox/media/samples/stock.mp4",
      "Wrapper",
      "https://pubads.g.doubleclick.net/gampad/ads?iu=/21775744923/external/"
          + "single_ad_samples&sz=640x480&cust_params=sample_ct%3Dredirectlinear&"
          + "ciu_szs=300x250%2C728x90&gdfp_req=1&output=vast&unviewed_position_start=1&"
          + "env=vp&impl=s&correlator=",
      R.drawable.play_video_ic,
      false),
  CUSTOM(
      "https://storage.googleapis.com/gvabox/media/samples/stock.mp4",
      "Custom",
      "custom",
      R.drawable.play_video_ic,
      false);

  public static final List<VideoMetadata> APP_VIDEOS =
      Arrays.asList(PRE_ROLL_NO_SKIP, PRE_ROLL_SKIP, VMAP);

  /** The thumbnail image for the video. */
  public final int thumbnail;

  /** The title of the video. */
  public final String title;

  /** The URL for the video. */
  public final String videoUrl;

  /** The ad tag for the video */
  public final String adTagUrl;

  /** If the ad is VMAP. */
  public final boolean isVmap;

  private VideoMetadata(
      String videoUrl, String title, String adTagUrl, int thumbnail, boolean isVmap) {
    this.videoUrl = videoUrl;
    this.title = title;
    this.adTagUrl = adTagUrl;
    this.thumbnail = thumbnail;
    this.isVmap = isVmap;
  }
}
