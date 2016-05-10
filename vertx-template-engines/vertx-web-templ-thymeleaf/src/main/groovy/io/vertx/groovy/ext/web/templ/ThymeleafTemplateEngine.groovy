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

package io.vertx.groovy.ext.web.templ;
import groovy.transform.CompileStatic
import io.vertx.lang.groovy.InternalHelper
import io.vertx.core.json.JsonObject
/**
 * A template engine that uses the Thymeleaf library.
*/
@CompileStatic
public class ThymeleafTemplateEngine extends TemplateEngine {
  private final def io.vertx.ext.web.templ.ThymeleafTemplateEngine delegate;
  public ThymeleafTemplateEngine(Object delegate) {
    super((io.vertx.ext.web.templ.ThymeleafTemplateEngine) delegate);
    this.delegate = (io.vertx.ext.web.templ.ThymeleafTemplateEngine) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * Create a template engine using defaults
   * @return the engine
   */
  public static ThymeleafTemplateEngine create() {
    def ret = InternalHelper.safeCreate(io.vertx.ext.web.templ.ThymeleafTemplateEngine.create(), io.vertx.groovy.ext.web.templ.ThymeleafTemplateEngine.class);
    return ret;
  }
  /**
   * Set the mode for the engine
   * @param mode the mode
   * @return a reference to this for fluency
   */
  public ThymeleafTemplateEngine setMode(String mode) {
    def ret = InternalHelper.safeCreate(delegate.setMode(mode), io.vertx.groovy.ext.web.templ.ThymeleafTemplateEngine.class);
    return ret;
  }
}
