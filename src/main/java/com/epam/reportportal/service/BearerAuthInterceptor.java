/*
 * Copyright 2019 EPAM Systems
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
package com.epam.reportportal.service;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.protocol.HttpContext;

/**
 * Adds Bearer TOKEN to the request headers
 */
public class BearerAuthInterceptor implements HttpRequestInterceptor {

	private final String uuid;

	public BearerAuthInterceptor(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public void process(HttpRequest request, HttpContext context) {
		request.setHeader(HttpHeaders.AUTHORIZATION, "bearer " + uuid);
	}
}
