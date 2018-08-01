/*
 * Copyright 2016-2018 the original author or authors.
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

package org.joinfaces.test;

import java.time.LocalDateTime;

import javax.annotation.PreDestroy;
import javax.faces.view.ViewScoped;

import org.springframework.stereotype.Component;

/**
 * Example spring bean which is accessed by JSF.
 *
 * @author Lars Grefer
 */
@ViewScoped
@Component("dummy")
public class DummyBean {

	public String getText() {
		return "Hello from Spring: " + LocalDateTime.now().toString();
	}

	@PreDestroy
	public void destroy() {
	}
}