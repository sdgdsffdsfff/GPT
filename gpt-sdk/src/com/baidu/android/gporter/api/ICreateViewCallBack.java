/**
 * Copyright (c) 2014 Baidu, Inc. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.android.gporter.api;

import android.view.View;

/**
 * View异步创建成功的回调
 *
 * @author liuhaitao
 * @since 2014年7月1日
 */
public interface ICreateViewCallBack {
    /**
     * 创建View后的回调
     *
     * @param packageName 插件包名
     * @param view        View或者viewGroup的子类（Context为插件的MAApplication）
     */
    void onViewCreated(String packageName, View view);
}
