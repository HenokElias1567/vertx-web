/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.rxjava.ext.web.handler;

import java.util.Map;
import rx.Observable;
import io.vertx.rxjava.ext.web.RoutingContext;
import io.vertx.core.Handler;

/**
 * A handler which decodes cookies from the request, makes them available in the 
 * and writes them back in the response.
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.web.handler.CookieHandler original} non RX-ified interface using Vert.x codegen.
 */

public class CookieHandler implements Handler<RoutingContext> {

  final io.vertx.ext.web.handler.CookieHandler delegate;

  public CookieHandler(io.vertx.ext.web.handler.CookieHandler delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  public void handle(RoutingContext arg0) { 
    delegate.handle((io.vertx.ext.web.RoutingContext)arg0.getDelegate());
  }

  /**
   * Create a cookie handler
   * @return the cookie handler
   */
  public static CookieHandler create() { 
    CookieHandler ret = CookieHandler.newInstance(io.vertx.ext.web.handler.CookieHandler.create());
    return ret;
  }


  public static CookieHandler newInstance(io.vertx.ext.web.handler.CookieHandler arg) {
    return arg != null ? new CookieHandler(arg) : null;
  }
}
