package com.dimthomas.borutoapp.domain.use_cases

import com.dimthomas.borutoapp.domain.use_cases.read_onboarding.ReadOnBoardingUseCase
import com.dimthomas.borutoapp.domain.use_cases.save_onboarding.SaveOnBoardingUseCase

data class UseCases(
    val saveOnBoardingUseCase: SaveOnBoardingUseCase,
    val readOnBoardingUseCase: ReadOnBoardingUseCase
)