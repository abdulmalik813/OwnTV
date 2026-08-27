package tv.own.owntv.ui.theme

import androidx.compose.ui.graphics.Color

/**
 * Material 3 tonal palette for OwnTV (teal-seeded). NEUTRAL + secondary/tertiary roles are
 * theme-only; the `primary` roles are seeded per [AccentColor] (default teal == these values).
 *
 * Dark uses a near-black background (#040e0b) so the panel colours (Phase 6) pop against
 * the deep dark surface while keeping a subtle green undertone.
 */

// Brand mark color (the OwnTV play logo) — constant.
val AccentCyan = Color(0xFFFFFFFF)

// ---------------- DARK (M3 dark monochrome) ----------------
val DarkBackground = Color(0xFF000000)
val DarkSurface = Color(0xFF0D0D0D)
val DarkSurfaceContainerLowest = Color(0xFF050505)
val DarkSurfaceContainerLow = Color(0xFF141414)
val DarkSurfaceContainer = Color(0xFF1F1F1F)
val DarkSurfaceContainerHigh = Color(0xFF2B2B2B)
val DarkSurfaceContainerHighest = Color(0xFF383838)
val DarkOnSurface = Color(0xFFFFFFFF)
val DarkOnSurfaceVariant = Color(0xFFCCCCCC)
val DarkOutline = Color(0xFF888888)
val DarkOutlineVariant = Color(0xFF444444)
val DarkSecondary = Color(0xFFE0E0E0)
val DarkOnSecondary = Color(0xFF000000)
val DarkSecondaryContainer = Color(0xFF333333)
val DarkOnSecondaryContainer = Color(0xFFFFFFFF)
val DarkTertiary = Color(0xFFCCCCCC)
val DarkOnTertiary = Color(0xFF000000)
val DarkTertiaryContainer = Color(0xFF404040)
val DarkOnTertiaryContainer = Color(0xFFFFFFFF)
val DarkError = Color(0xFFFFFFFF)

// ---------------- LIGHT (M3 light monochrome) ----------------
val LightBackground = Color(0xFFFFFFFF)
val LightSurface = Color(0xFFFFFFFF)
val LightSurfaceContainerLowest = Color(0xFFFFFFFF)
val LightSurfaceContainerLow = Color(0xFFF2F2F2)
val LightSurfaceContainer = Color(0xFFE6E6E6)
val LightSurfaceContainerHigh = Color(0xFFD9D9D9)
val LightSurfaceContainerHighest = Color(0xFFCCCCCC)
val LightOnSurface = Color(0xFF000000)
val LightOnSurfaceVariant = Color(0xFF444444)
val LightOutline = Color(0xFF777777)
val LightOutlineVariant = Color(0xFFCCCCCC)
val LightSecondary = Color(0xFF333333)
val LightOnSecondary = Color(0xFFFFFFFF)
val LightSecondaryContainer = Color(0xFFE0E0E0)
val LightOnSecondaryContainer = Color(0xFF000000)
val LightTertiary = Color(0xFF555555)
val LightOnTertiary = Color(0xFFFFFFFF)
val LightTertiaryContainer = Color(0xFFEAEAEA)
val LightOnTertiaryContainer = Color(0xFF000000)
val LightError = Color(0xFF000000)
