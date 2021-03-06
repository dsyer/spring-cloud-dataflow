/*
 * Copyright 2015 the original author or authors.
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

package org.springframework.cloud.dataflow.admin.repository;

/**
 * Thrown to indicate that the creation of a stream failed
 * because a stream with the given name already exists.
 *
 * @author Mark Fisher
 */
public class DuplicateStreamDefinitionException extends RuntimeException {

	private static final long serialVersionUID = -3073129756296341192L;

	public DuplicateStreamDefinitionException() {
		super();
	}

	public DuplicateStreamDefinitionException(String message) {
		super(message);
	}
}
