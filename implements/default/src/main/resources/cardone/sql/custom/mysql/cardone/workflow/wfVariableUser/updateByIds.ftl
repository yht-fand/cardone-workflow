UPDATE t_wf_variable_user SET END_DATE = NOW() WHERE INSTR(:ids, ID) > 0