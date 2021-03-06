package com.ccr.library.gpu;

/**
 * Copyright (C) 2018 Wasabeef
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.support.annotation.NonNull;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import jp.co.cyberagent.android.gpuimage.GPUImageColorInvertFilter;

import static android.provider.Telephony.Mms.Part.CHARSET;

/**
 * Invert all the colors in the image.
 */
public class InvertFilterTransformation extends GPUFilterTransformation {

  private static final int VERSION = 1;
  private static final String ID =
      "jp.wasabeef.glide.transformations.gpu.InvertFilterTransformation." + VERSION;

  public InvertFilterTransformation() {
    super(new GPUImageColorInvertFilter());
  }

  @Override public String toString() {
    return "InvertFilterTransformation()";
  }

  @Override public boolean equals(Object o) {
    return o instanceof InvertFilterTransformation;
  }

  @Override public int hashCode() {
    return ID.hashCode();
  }

  @Override public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
      messageDigest.update((ID).getBytes(CHARSET));

  }
}
