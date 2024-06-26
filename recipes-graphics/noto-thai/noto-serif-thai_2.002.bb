
inherit noto-fonts
inherit noto-styles

LIC_FILES_CHKSUM = "file://OFL.txt;md5=d7c94b25f07127276c3e513f9f9d2b33"
SRC_URI = "${NOTOFONTS_SRC_URI_PREFIX}/thai/releases/download/NotoSerifThai-v${PV}/NotoSerifThai-v${PV}.zip"

SRC_URI[sha256sum] = "89e3c04bfc54d9a5dd0aec660bf974ad46df38385df7d9397c083482d515049a"

do_install:append() {
  # get rid of NotoSerifThai[wdth,wght].ttf and NotoSerifThai[wght].ttf with literal brackets,
  # since they don't fit packaging scheme and we don't need them (just use the single-style files) 
  rm ${D}/usr/share/fonts/opentype/noto/NotoSerifThai\[*
}
