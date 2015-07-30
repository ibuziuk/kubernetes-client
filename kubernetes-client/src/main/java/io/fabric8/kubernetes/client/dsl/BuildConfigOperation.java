/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.fabric8.kubernetes.client.dsl;

import io.fabric8.openshift.api.model.BuildConfig;
import io.fabric8.openshift.api.model.BuildConfigList;
import io.fabric8.openshift.api.model.DoneableBuildConfig;
import io.fabric8.openshift.api.model.WebHookTrigger;

public interface BuildConfigOperation extends BuildConfigResource<BuildConfig, DoneableBuildConfig, Void, Boolean, Void, Void>,
  Typeable<Triggerable<WebHookTrigger, Void>>,
  Triggerable<WebHookTrigger, Void>,
  Secretable<Typeable<Triggerable<WebHookTrigger, Void>>>,
  ClientOperation<BuildConfig, BuildConfigList,DoneableBuildConfig, BuildConfigResource<BuildConfig, DoneableBuildConfig, Void, Boolean, Void, Void>> {
}