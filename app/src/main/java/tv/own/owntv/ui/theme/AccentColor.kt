package tv.own.owntv.ui.theme

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.Color
import tv.own.owntv.R

/**
 * Material You-style accent presets. OwnTV can't rely on true wallpaper-based dynamic color (a phone
 * feature that isn't dependable on Android TV), so instead the user picks an accent and the M3 color
 * scheme is seeded from it. Each preset carries its tonal `primary` / `primaryContainer` roles for
 * both dark and light themes (M3 uses lighter tones on dark surfaces, darker tones on light).
 *
 * Neutrals (background, surface containers, text, outline) are theme-only and live in [OwnTVColors].
 */
enum class AccentColor(
    @param:StringRes val labelRes: Int,
    private val primaryDark: Color,
    private val onPrimaryDark: Color,
    private val primaryContainerDark: Color,
    private val onPrimaryContainerDark: Color,
    private val primaryLight: Color,
    private val onPrimaryLight: Color,
    private val primaryContainerLight: Color,
    private val onPrimaryContainerLight: Color,
) {
    TEAL(
        R.string.settings_accent_teal,
        primaryDark = Color(0xFFFFFFFF), onPrimaryDark = Color(0xFF000000),
        primaryContainerDark = Color(0xFF333333), onPrimaryContainerDark = Color(0xFFFFFFFF),
        primaryLight = Color(0xFF000000), onPrimaryLight = Color(0xFFFFFFFF),
        primaryContainerLight = Color(0xFFE0E0E0), onPrimaryContainerLight = Color(0xFF000000),
    ),
    BLUE(
        R.string.settings_accent_blue,
        primaryDark = Color(0xFFFFFFFF), onPrimaryDark = Color(0xFF000000),
        primaryContainerDark = Color(0xFF333333), onPrimaryContainerDark = Color(0xFFFFFFFF),
        primaryLight = Color(0xFF000000), onPrimaryLight = Color(0xFFFFFFFF),
        primaryContainerLight = Color(0xFFE0E0E0), onPrimaryContainerLight = Color(0xFF000000),
    ),
    VIOLET(
        R.string.settings_accent_violet,
        primaryDark = Color(0xFFFFFFFF), onPrimaryDark = Color(0xFF000000),
        primaryContainerDark = Color(0xFF333333), onPrimaryContainerDark = Color(0xFFFFFFFF),
        primaryLight = Color(0xFF000000), onPrimaryLight = Color(0xFFFFFFFF),
        primaryContainerLight = Color(0xFFE0E0E0), onPrimaryContainerLight = Color(0xFF000000),
    ),
    GREEN(
        R.string.settings_accent_green,
        primaryDark = Color(0xFFFFFFFF), onPrimaryDark = Color(0xFF000000),
        primaryContainerDark = Color(0xFF333333), onPrimaryContainerDark = Color(0xFFFFFFFF),
        primaryLight = Color(0xFF000000), onPrimaryLight = Color(0xFFFFFFFF),
        primaryContainerLight = Color(0xFFE0E0E0), onPrimaryContainerLight = Color(0xFF000000),
    ),
    AMBER(
        R.string.settings_accent_amber,
        primaryDark = Color(0xFFFFFFFF), onPrimaryDark = Color(0xFF000000),
        primaryContainerDark = Color(0xFF333333), onPrimaryContainerDark = Color(0xFFFFFFFF),
        primaryLight = Color(0xFF000000), onPrimaryLight = Color(0xFFFFFFFF),
        primaryContainerLight = Color(0xFFE0E0E0), onPrimaryContainerLight = Color(0xFF000000),
    );

    fun primary(isDark: Boolean) = if (isDark) primaryDark else primaryLight
    fun onPrimary(isDark: Boolean) = if (isDark) onPrimaryDark else onPrimaryLight
    fun primaryContainer(isDark: Boolean) = if (isDark) primaryContainerDark else primaryContainerLight
    fun onPrimaryContainer(isDark: Boolean) = if (isDark) onPrimaryContainerDark else onPrimaryContainerLight
}
