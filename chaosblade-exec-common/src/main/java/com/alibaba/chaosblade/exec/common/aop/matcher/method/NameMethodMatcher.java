/*
 * Copyright 1999-2019 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.chaosblade.exec.common.aop.matcher.method;

import com.alibaba.chaosblade.exec.common.aop.matcher.MethodInfo;

/**
 * Match by method name
 *
 * @author Changjun Xiao
 */
public class NameMethodMatcher implements MethodMatcher {

    private String methodName;

    public NameMethodMatcher(String methodName) {
        this.methodName = methodName;
    }

    @Override
    public boolean isMatched(String methodName, MethodInfo methodInfo) {
        return this.methodName.equals(methodName);
    }
}
