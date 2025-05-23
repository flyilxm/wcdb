// Created by chenqiuwen on 2023/11/4.
//

/*
 * Tencent is pleased to support the open source community by making
 * WCDB available.
 *
 * Copyright (C) 2017 THL A29 Limited, a Tencent company.
 * All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *       https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencent.wcdbtest.orm.testclass

import com.tencent.wcdb.FTSModule
import com.tencent.wcdb.FTSVersion
import com.tencent.wcdb.WCDBField
import com.tencent.wcdb.WCDBTableCoding
import com.tencent.wcdb.fts.BuiltinTokenizer

@WCDBTableCoding(
    ftsModule = FTSModule(
        version = FTSVersion.FTS5,
        tokenizer = BuiltinTokenizer.Verbatim,
        tokenizerParameters = [BuiltinTokenizer.Parameter.SkipStemming, BuiltinTokenizer.Parameter.SimplifyChinese],
        externalTable = "contentTable"
    )
)
class FTS5TestObject {
    @WCDBField(isNotIndexed = true)
    var id: Int = 0

    @WCDBField
    var content: String = ""
}