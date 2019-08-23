/*
 * Copyright 2018-Present Okta, Inc.
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
package com.okta.maven.orgcreation.service;

import com.okta.sdk.impl.config.ClientConfiguration;
import org.apache.maven.plugin.MojoExecutionException;

import java.io.File;
import java.io.IOException;

public interface SdkConfigurationService {

    ClientConfiguration loadUnvalidatedConfiguration() throws MojoExecutionException;

    void writeOktaYaml(String orgUrl, String apiToken, File oktaPropsFile) throws IOException;

}
