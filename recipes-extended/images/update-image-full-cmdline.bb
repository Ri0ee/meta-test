LICENSE = "MIT"

inherit swupdate

SRC_URI = "\
	file://emmcsetup.lua \
	file://sw-description \
"

IMAGE_DEPENDS = "core-image-full-cmdline"
SWUPDATE_IMAGES = "core-image-full-cmdline"
SWUPDATE_IMAGES_FSTYPES[core-image-full-cmdline] = ".ext4.gz"
