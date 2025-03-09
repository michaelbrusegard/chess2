package io.github.chessevolved.supabase

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.logging.LogLevel
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.realtime.Realtime
import io.github.jan.supabase.serializer.KotlinXSerializer
import kotlinx.serialization.json.Json
import kotlin.time.Duration.Companion.seconds

object SupabaseClient {
    init {
        createSupabaseClient(
            supabaseUrl = "https://tsmubattgglbqaarktnw.supabase.co",

            // This key is an admin (service role) key.
            supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InRzbXViYXR0Z2dsYnFhYXJrdG53Iiwicm9sZSI6InNlcnZpY2Vfcm9sZSIsImlhdCI6MTc0MDkwMDY3MywiZXhwIjoyMDU2NDc2NjczfQ.T4TeABfCXB9-8ECPM_YrhiVrK4GWrkTmMcdv0pXScIg"
        ) {
            install(Postgrest)
            install(Realtime) {
                reconnectDelay = 5.seconds // Default: 7 seconds
            }
            defaultLogLevel = LogLevel.INFO
            defaultSerializer = KotlinXSerializer(Json {
                //Custom serializer config
            })
        }
        println("Supabase Client Initialized")
    }
}
