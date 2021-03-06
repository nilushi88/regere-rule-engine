/*
 * Copyright 2012 The regere-rule-engine Project
 *
 * The regere-rule-engine Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package dev.j.regere.respository;

import dev.j.regere.domain.RegereRuleFlowWrapper;

import java.util.List;
import java.util.Map;

public interface IntermediatePersistedTable {

    void init();

    RegereRuleFlowWrapper load(String regereId, String commonIdentifier, Map<String, Object> currentEvent);

    void persistEvent(String regereId, String commonIdentifier, RegereRuleFlowWrapper flowWrapper,
                      List<String> persitableKeys);
}
