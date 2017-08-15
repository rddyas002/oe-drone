require recipes-core/images/core-image-minimal.bb

CORE_OS = " \
    openssh openssh-keygen \
"

DEV_SDK_INSTALL = " \
    binutils \
    coreutils \
"

EXTRA_TOOLS_INSTALL = " \
    nano \
    gadget-init \
    bash \
"

KERNEL_EXTRA_INSTALL = " \
    kernel-modules \
    kernel-devicetree \
"

IMAGE_INSTALL += " \
    ${CORE_OS} \
    ${DEV_SDK_INSTALL} \
    ${EXTRA_TOOLS_INSTALL} \
    ${KERNEL_EXTRA_INSTALL} \
"

export IMAGE_BASENAME = "drone-image"
