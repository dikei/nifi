/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rules.v1_2_0

import org.apache.nifi.toolkit.admin.configmigrator.rules.XmlMigrationRule
import org.apache.nifi.toolkit.admin.util.AdminUtil
import org.apache.nifi.toolkit.admin.util.Version

class LoginIdentityProvidersRule extends XmlMigrationRule{

    @Override
    Boolean supportedVersion(String versionStr) {
        return AdminUtil.supportedVersion("1.0.0","1.2.0",versionStr)
    }

    @Override
    byte[] migrateXml(Node oldXmlContent, Node newXmlContent) {
        new Node(oldXmlContent, 'fake', [:])
        return convertToByteArray(oldXmlContent)
    }

}