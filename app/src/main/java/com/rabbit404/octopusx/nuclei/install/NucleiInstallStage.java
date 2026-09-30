package com.rabbit404.octopusx.nuclei.install;

import com.rabbit404.octopusx.R;

public enum NucleiInstallStage {
    PREPARE(R.string.nuclei_install_stage_prepare),
    REFRESH(R.string.nuclei_install_stage_refresh),
    RESOLVE(R.string.nuclei_install_stage_install_go),
    DOWNLOAD(R.string.nuclei_install_stage_go_build),
    DEPLOY(R.string.nuclei_install_stage_deploy),
    TEMPLATES(R.string.nuclei_install_stage_templates),
    VERIFY(R.string.nuclei_install_stage_verify);

    public final int titleRes;

    NucleiInstallStage(int titleRes) {
        this.titleRes = titleRes;
    }
}
