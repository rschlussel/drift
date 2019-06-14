/*
 * Copyright (C) 2012 Facebook, Inc.
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
package com.facebook.drift.codec.internal.reflection;

import com.facebook.drift.codec.AbstractThriftCodecManagerTest;
import com.facebook.drift.codec.ThriftCodecManager;
import com.facebook.drift.codec.internal.compiler.CompilerThriftCodecFactory;
import org.testng.annotations.Test;

@Test
public class TestReflectionToCompilerThriftCodecFactory
        extends AbstractThriftCodecManagerTest
{
    @Override
    public ThriftCodecManager createReadCodecManager()
    {
        return new ThriftCodecManager(new CompilerThriftCodecFactory(false));
    }

    @Override
    public ThriftCodecManager createWriteCodecManager()
    {
        return new ThriftCodecManager(new ReflectionThriftCodecFactory());
    }
}
