/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.aerogear.todo.server.security.service;

import org.jboss.picketlink.idm.model.Group;
import org.jboss.picketlink.idm.model.User;

public interface UserBuilder {

    AddMethods add(User user);

    GrantMethods grant(String... roles);

    public static interface AddMethods {
        TargetEntity to(Group... groups);
    }

    public static interface GrantMethods {
        TargetEntity to(User user);
    }

    public static interface TargetEntity {
        <T> T to(Class<T> clazz);
    }
}