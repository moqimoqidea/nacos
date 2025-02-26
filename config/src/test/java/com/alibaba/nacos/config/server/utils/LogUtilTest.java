/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.nacos.config.server.utils;

import ch.qos.logback.classic.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LogUtilTest {
    
    @Test
    void testSetLogLevel() {
        
        LogUtil.setLogLevel("config-server", "INFO");
        ch.qos.logback.classic.Logger defaultLog = (Logger) LogUtil.DEFAULT_LOG;
        assertEquals("INFO", defaultLog.getLevel().levelStr);
        
        LogUtil.setLogLevel("config-fatal", "INFO");
        ch.qos.logback.classic.Logger fatalLog = (Logger) LogUtil.FATAL_LOG;
        assertEquals("INFO", fatalLog.getLevel().levelStr);
        
        LogUtil.setLogLevel("config-pull", "INFO");
        ch.qos.logback.classic.Logger pullLog = (Logger) LogUtil.PULL_LOG;
        assertEquals("INFO", pullLog.getLevel().levelStr);
        
        LogUtil.setLogLevel("config-pull-check", "INFO");
        ch.qos.logback.classic.Logger pullCheckLog = (Logger) LogUtil.PULL_CHECK_LOG;
        assertEquals("INFO", pullCheckLog.getLevel().levelStr);
        
        LogUtil.setLogLevel("config-dump", "INFO");
        ch.qos.logback.classic.Logger dumpLog = (Logger) LogUtil.DUMP_LOG;
        assertEquals("INFO", dumpLog.getLevel().levelStr);
        
        LogUtil.setLogLevel("config-memory", "INFO");
        ch.qos.logback.classic.Logger memoryLog = (Logger) LogUtil.MEMORY_LOG;
        assertEquals("INFO", memoryLog.getLevel().levelStr);
        
        LogUtil.setLogLevel("config-client-request", "INFO");
        ch.qos.logback.classic.Logger clientRequestLog = (Logger) LogUtil.CLIENT_LOG;
        assertEquals("INFO", clientRequestLog.getLevel().levelStr);
        
        LogUtil.setLogLevel("config-trace", "INFO");
        ch.qos.logback.classic.Logger traceLog = (Logger) LogUtil.TRACE_LOG;
        assertEquals("INFO", traceLog.getLevel().levelStr);
        
        LogUtil.setLogLevel("config-notify", "INFO");
        ch.qos.logback.classic.Logger notifyLog = (Logger) LogUtil.NOTIFY_LOG;
        assertEquals("INFO", notifyLog.getLevel().levelStr);
        
    }
}
