/* Generated by Xgen from: E130.08.01 SIR 149794 on: 2010-02-12 15:07 */
/*******************************************************************************
* 2010 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqEbiEfpIdxTrd.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire EBI EFP-Index Future Trade
*
*******************************************************************************/

#ifndef _INQEBIEFPIDXTRD_HXX_
#define _INQEBIEFPIDXTRD_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

/******************************************************************************/

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

/******************************************************************************/

#define BSC_INQ_EBI_EFP_FIN_TRD_RESP_REC_MAX     30

/******************************************************************************/

#ifndef _FUT_BSC_INQ_EBI_EFP_IDX_TRD_REQUEST_T_
#define _FUT_BSC_INQ_EBI_EFP_IDX_TRD_REQUEST_T_

typedef struct futBscInqEbiEfpIdxTrdRequestTag
{
    char             ebiTrdRefNo     [EBI_TRD_REF_NO_LEN];
} futBscInqEbiEfpIdxTrdRequestT, *pFutBscInqEbiEfpIdxTrdRequestT;

#endif  /* _FUT_BSC_INQ_EBI_EFP_IDX_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_EBI_EFP_IDX_TRD_REQUEST_T_
#define _FUT_INQ_EBI_EFP_IDX_TRD_REQUEST_T_

typedef struct futInqEbiEfpIdxTrdRequestTag
{
    dataHeaderT      header;
    futBscInqEbiEfpIdxTrdRequestT basic;
} futInqEbiEfpIdxTrdRequestT, *pFutInqEbiEfpIdxTrdRequestT;

#endif  /* _FUT_INQ_EBI_EFP_IDX_TRD_REQUEST_T_ */

/******************************************************************************/

#ifndef _FUT_BSC_INQ_EBI_EFP_IDX_TRD_RESPONSE_T_
#define _FUT_BSC_INQ_EBI_EFP_IDX_TRD_RESPONSE_T_

typedef struct futBscInqEbiEfpIdxTrdResponseTag
{
    ebiTrdInqRespGrpT ebiTrdInqRespGrp;
    char             hdgeTyp         [HDGE_TYP_LEN];
    char             setlInst        [SETL_INST_LEN];
    char             cshBsktRefId    [CSH_BSKT_REF_ID_LEN];
    char             currTypCod      [CURR_TYP_COD_LEN];
    char             mliRecCtr       [DRIV_MLI_REC_CTR_LEN];
    bscInqEbiTrdRespRecT bscInqEbiTrdRespRec [BSC_INQ_EBI_EFP_FIN_TRD_RESP_REC_MAX];
} futBscInqEbiEfpIdxTrdResponseT, *pFutBscInqEbiEfpIdxTrdResponseT;

#endif  /* _FUT_BSC_INQ_EBI_EFP_IDX_TRD_RESPONSE_T_ */

/******************************************************************************/

#ifndef _FUT_INQ_EBI_EFP_IDX_TRD_RESPONSE_T_
#define _FUT_INQ_EBI_EFP_IDX_TRD_RESPONSE_T_

typedef struct futInqEbiEfpIdxTrdResponseTag
{
    dataHeaderT      header;
    futBscInqEbiEfpIdxTrdResponseT basic;
} futInqEbiEfpIdxTrdResponseT, *pFutInqEbiEfpIdxTrdResponseT;

#endif  /* _FUT_INQ_EBI_EFP_IDX_TRD_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQEBIEFPIDXTRD_HXX_ */

/******************************************************************************/
/* End of file InqEbiEfpIdxTrd.hxx */
/******************************************************************************/
