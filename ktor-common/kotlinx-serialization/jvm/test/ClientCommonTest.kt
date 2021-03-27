/*
 * Copyright 2014-2021 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

import io.ktor.client.features.contentnegatiation.tests.*
import io.ktor.common.serialization.*

class ClientCommonTest : ClientContentNegotiationTest() {
    override val converter = KotlinxSerializationConverter(DefaultJson)
}
